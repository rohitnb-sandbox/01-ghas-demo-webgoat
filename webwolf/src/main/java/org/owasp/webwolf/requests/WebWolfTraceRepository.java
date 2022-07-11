/*
 * This file is part of WebGoat, an Open Web Application Security Project utility. For details, please see http://www.owasp.org/
 *
 * Copyright (c) 2002 - 2019 Bruce Mayhew
 *
 * This program is free software; you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this program; if
 * not, write to the Free Software Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA
 * 02111-1307, USA.
 *
 * Getting Source ==============
 *
 * Source for this application is maintained at https://github.com/WebGoat/WebGoat, a repository for free software projects.
 */
package org.owasp.webwolf.requests;

import com.google.common.collect.EvictingQueue;
import com.google.common.collect.Lists;
import org.springframework.boot.actuate.trace.http.HttpTrace;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import java.util.List;

/**
 * Keep track of all the incoming requests, we are only keeping track of request originating from
 * WebGoat.
 *
 * @author nbaars
 * @since 8/13/17.
 */
public class WebWolfTraceRepository implements HttpTraceRepository {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(WebWolfTraceRepository.class);
    private final EvictingQueue<HttpTrace> traces = EvictingQueue.create(10000);
    private List<String> exclusionList = Lists.newArrayList("/tmpdir", "/WebWolf/home", "/WebWolf/mail", "/WebWolf/files", "/images/", "/login", "/favicon.ico", "/js/", "/webjars/", "/WebWolf/requests", "/css/", "/mail");

    @Override
    public List<HttpTrace> findAll() {
        return List.of();
    }

    public List<HttpTrace> findAllTraces() {
        return Lists.newArrayList(traces);
    }

    private boolean isInExclusionList(String path) {
        return exclusionList.stream().anyMatch(e -> path.contains(e));
    }

    @Override
    public void add(HttpTrace httpTrace) {
        var path = httpTrace.getRequest().getUri().getPath();
        if (!isInExclusionList(path)) {
            traces.add(httpTrace);
        }
    }
}
