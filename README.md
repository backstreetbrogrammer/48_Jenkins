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
2. Continuous Delivery With Jenkins
3. Jenkins Pipeline
4. Jenkins With Docker

---

## Chapter 01. Continuous Integration With Jenkins

**_Continuous Integration_**

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

**_Jenkins Overview_**

![JenkinsDashboard](JenkinsDashboard.PNG)

- Jenkins is a continuous integration and build server written in Java
- It is used to manually, periodically, or automatically build software development projects
- Jenkins is used by teams of all different sizes, for projects with various languages

Jenkins is very popular because:

- Easy to use
- Great extensibility:
    - Support different version control systems
    - Code quality metrics
    - Build notifiers
    - UI customization

