# patchpilot-demo-java

A deliberately small Maven project that serves as the target repository for
[PatchPilot](https://github.com/bingqin2/PatchPilot) demos. It ships with one
known bug so that a `/agent fix` request has something real to fix: the test
suite is red on `main` until PatchPilot opens a pull request that makes it green.

- Build: `mvn test`
- Known bug: `Calculator.divide` throws `ArithmeticException` on a zero divisor
  instead of the documented `IllegalArgumentException("divisor must not be zero")`.
