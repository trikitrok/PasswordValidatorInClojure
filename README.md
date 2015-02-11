# Password Validator kata
=======================

* A password should have more than 6 chars

* A password should contain at least 1 char in upper case

* A password should contain at least 1 char in lower case

* A password should contain at least 1 underscore

* A password should contain at least 1 number

The project uses [Midje](https://github.com/marick/Midje/).

How to run the tests

`lein midje` will run all tests.

`lein midje namespace.*` will run only tests beginning with "namespace.".

`lein midje :autotest` will run all the tests indefinitely. It sets up a
watcher on the code files. If they change, only the relevant tests will be
run again.
