# Jenkins

> This is a tutorial course covering Jenkins and CI/CD pipeline.

Tools used:

- JDK 11
- Maven
- JUnit 5, Mockito
- IntelliJ IDE
- Jenkins

## Table of contents

1. [Continuous Integration With Jenkins](https://github.com/backstreetbrogrammer/48_Jenkins?tab=readme-ov-file#chapter-01-continuous-integration-with-jenkins)
    - [Continuous Integration Overview](https://github.com/backstreetbrogrammer/48_Jenkins?tab=readme-ov-file#continuous-integration-overview)
    - [Install Jenkins](https://github.com/backstreetbrogrammer/48_Jenkins?tab=readme-ov-file#install-jenkins)
    - [Jenkins Overview](https://github.com/backstreetbrogrammer/48_Jenkins?tab=readme-ov-file#jenkins-overview)
2. Continuous Delivery With Jenkins
3. Jenkins Pipeline
4. Jenkins With Docker

---

## Chapter 01. Continuous Integration With Jenkins

### Continuous Integration Overview

![JenkinsCI](JenkinsCI.PNG)

- Developers commit code to a shared repository on a regular basis
- Version control system is being monitored
- When a commit is detected, a build will be triggered automatically
- If the build is not green, developers will be notified immediately

**Advantages:**

- Detect problems or bugs, as early as possible, in the development life cycle
- Since the entire code base is integrated, built and tested constantly, the potential bugs and errors are caught
  earlier in the life cycle which results in better quality software

**_Different stages of adopting CI_**

**Stage 1**

- No build servers: developers build their application on their local servers
- Developers do NOT commit to the central repository on a regular basis
- Before the release, changes are integrated and tested manually
- There are very few releases

**Stage 2**

- Build servers are present and automated builds are scheduled on a regular basis (say, nightly)
- Build script compiles the application and runs a set of **automated tests**
- Developers now commit their changes regularly
- Build servers would alert the team members in case of build failure

**Stage 3**

- A build is triggered **automatically** whenever new code is committed to the central repository
- Broken builds are usually treated as a high-priority issue and are fixed quickly

**Stage 4**

- Automated **code quality and code coverage** metrics are now run along with unit tests to continuously evaluate the
  code quality
- With the increase in code quality and code coverage, we will notice that we have fewer and fewer build failures

**Stage 5**

- Automated **Deployment**: the deployment process should be automated, with no manual steps involved
- Fixing broken builds should be treated as a high-priority issue for all team members
- All team members should focus on contributing to high-quality tests because the confidentiality of the CI process
  highly depends on the quality of the tests

**_Difference between Continuous Integration, Continuous Delivery, Continuous Deployment_**

**Continuous Integration**

> The practice of merging development work with the main branch constantly.

**Continuous Delivery**

> Continual delivery of code to an environment once the code is ready to ship. This could be staging or production. The
> idea is the product is delivered to a user base, which can be QAs or customers for review and inspection.

**Continuous Deployment**

> The deployment or release of code to production as soon as it is ready.

### Install Jenkins

- Navigate to [Jenkins Download](https://www.jenkins.io/download/#downloading-jenkins)
- Download Jenkins `2.426.3 LTS` for Windows: `jenkins.msi`
- Install using the msi installer
- Logon Type can be marked as: `Run service as LocalSystem`
- Select all the defaults and install

**Verify**

- Launch on browser: `http://localhost:8080/`
- The Login page will come where we need to type the admin password located at:

`C:\ProgramData\Jenkins\.jenkins\secrets\initialAdminPassword`

- Follow the defaults — we can skip all the plugin installations for now
- Once the setup is complete, Jenkins dashboard will display
- For now, click on `admin` user in the top-right and change the password in `Configure`
- Jenkins will be logged in again with the new password

### Jenkins Overview

- Jenkins is a continuous integration and build server written in Java
- It is used to manually, periodically, or automatically build software development projects
- Jenkins is used by teams of all different sizes, for projects with various languages

Jenkins is very popular because:

- Ease to use
- Great extensibility via plugins:
    - Support different version control systems
    - Code quality metrics
    - Build notifiers
    - UI customization

**_Jenkins Master-Slave Architecture_**

![MasterSlave](MasterSlave.PNG)

**Master:**

- Schedule build jobs
- Dispatch builds to the slaves for the actual job execution
- Monitor the slaves and record the build results
- Can also execute build jobs directly

**Slave:**

- Execute build jobs dispatched by the master

**_Jenkins Terminology_**

**Job or Project**

- Those two terms are used interchangeably. They all refer to runnable tasks that are controlled / monitored by Jenkins.

**Slave or Node**

- Slaves are computers that are set up to build projects for a master
- Jenkins runs a separate program called **"slave agent"** on slaves
- When slaves are registered to a master, a master starts distributing loads to slaves
- Node is used to refer to all machines that are part of Jenkins grid, slaves and master

**Executor**

- Executor is a separate stream of builds to be run on a node in parallel
- A Node can have one or more executors

**Build**

- A build is a result of one of the projects

**Plugin**

- A Plugin, like plugins on any other system, is a piece of software that extends the core functionality of the core
  Jenkins server

**_Jenkins UI Overview_**

![JenkinsDashboard](JenkinsDashboard.PNG)

- The Main Dashboard will display all the jobs, also called as `Job Table`
- Left pane consists of `Configuration Panel`, `Build Queue` and `Build Executor Status` panels
- Top `Header` can be used to login / logout / search / enable auto refresh etc.

**Configuration Panel**

- `New Item` is used to add a new job
- `People` is used to manage users
- `Build History` shows all the builds history on master or slave nodes
- `Manage Jenkins` is the main page for doing all Jenkins configurations
- `My Views` can be used to provide a customized view for each user where only selected jobs can be displayed

**_Create our first Jenkins job_**

