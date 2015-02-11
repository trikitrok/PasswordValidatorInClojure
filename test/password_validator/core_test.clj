(ns password-validator.core-test
  (:use midje.sweet)
  (:use [password-validator.core]))

(facts 
  "about password validator"
  (fact 
    "it accepts a valid password"
    (valid? "_Ab3ccc") => true))
