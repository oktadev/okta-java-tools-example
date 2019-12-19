# Five Tools to Improve Your Java Code Example

Please read [Five Tools to Improve Your Java Code][blog-post] to see how this project was created and more about the tools contained within.

**Prerequisites:** [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

> [Okta](https://developer.okta.com/) has Authentication and User Management APIs that reduce development time with instant-on, scalable user infrastructure. Okta's intuitive API and expert support make it easy for developers to authenticate, manage, and secure users and roles in any application.

* [Getting Started](#getting-started)
* [Links](#links)
* [Help](#help)
* [License](#license)

## Getting Started

To install this example application, run the following commands:

```bash
git clone https://github.com/oktadeveloper/okta-java-tools-example.git
cd okta-java-tools-example
```

This will get a copy of the project installed locally. To build the project and skip the quality checks run:

```txt
./mvnw verify -Dpmd.skip -Dspotbugs.skip
```


To view just the PMD errors:
 
```txt
./mvnw verify -Dspotbugs.skip
```

To view just the Spotbugs errors:
 
```txt
./mvnw verify -Dpmd.skip
```

To simulate a _normal_ build run:

```text
./mvnw verify
```

## Links

This example uses the following projects:

* [PMD](https://pmd.github.io/)
* [Spotbugs](https://spotbugs.github.io/)
* [JaCoCo](https://www.eclemma.org/jacoco/)

## Help

Please post any questions as comments on the [blog post][blog-post], or visit our [Okta Developer Forums](https://devforum.okta.com/). You can also email developers@okta.com if you would like to create a support ticket.

## License

Apache 2.0, see [LICENSE](LICENSE).

[blog-post]: https://developer.okta.com/blog/2019/12/20/five-tools-improve-java