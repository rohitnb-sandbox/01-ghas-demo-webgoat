#!/bin/sh

#java \
#  -jar lombok.jar \
#  delombok \
#  -f suppressWarnings:skip \
#  -f generated:skip \
#  -f generateDelombokComment:skip \
#  --classpath="$MYCLASSPATH" \
#  -n --onlyChanged \
#  .
#

mvn clean

find_subprojects(){
  find . -name "pom.xml" -type f | xargs dirname
}

find_subprojects | while read sp; do
  srcdir="${sp}/src/main/java"
  lombokdir="${sp}/src/main/lombok"
  if [ ! -d "$srcdir" ]; then
    continue
  fi

  rm -rf "$lombokdir"
  mv "$srcdir" "$lombokdir"
done

mvn generate-sources

find_subprojects | while read sp; do
  srcdir="${sp}/src/main/java"
  lombokdir="${sp}/src/main/lombok"
  delombokdir="${sp}/target/generated-sources/delombok"
  if [ ! -d "$lombokdir" ]; then
    continue
  fi

  rm -rf "$lombokdir"
  mv "$delombokdir" "$srcdir"
done

mvn clean
