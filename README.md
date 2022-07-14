# How to try GitHub Advanced Security with this repository?

- [ ] Create a new repository on your Organization by using the "Use this template" button
- [ ] Enable all of GitHub's Code Security and Analysis features by going to `Settings`->`Code Security and Analysis`. Ensure you have enabled Dependency Graph, Dependabot Alerts, Dependabot Security Updates, Dependabot Version Updates, GitHub Advanced Security, and Secret Scanning. NOTE: If your Organization, doesn't have the GHAS SKU, you will not be able to enable GHAS features just yet
- [ ] Once you enable these flags, you'll start noticing a whole bunch of alerts (Dependabot) in the `Security` tab of the repository. This is okay and expected. WebGOAT is a deliberately insecure application and is supposed to have many security issues.
- [ ] Navigate to `.github/workflows/` folder and rename the `codeql-analysis.yml.disabled` to `codeql-analysis.yml`. Commit the file.
- [ ] This will kick off the GitHub Action to run CodeQL in three popular levels - Default, Extended, and Extended with Quality. Each stage will execute and a corresponding CSV file will be made available in the execution logs. 

# Resources:

WebGOAT is a great open sourced application for Security professionals. Read more about [this here](https://github.com/WebGoat/WebGoat)