(ns password-validator.core-test
  (:use midje.sweet)
  (:use [password-validator.core]))

(facts 
  "about password validator"
  (fact 
    "it accepts a valid password"
    (valid? "_Ab3ccc") => true)
  
  (fact 
    "it rejects passwords with no more than 6 characters"
    (valid? "_Ab3cc") => false)
  
  (fact
    "it rejects passwords that does not contain 
    at least on uppercase character"
    (valid? "_ab3ccc") => false))
