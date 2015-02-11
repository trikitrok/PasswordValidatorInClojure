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
    "it rejects passwords that do not contain 
    at least one upper case character"
    (valid? "_ab3ccc") => false)
  
  (fact
    "it rejects passwords that do not contain 
    at least one lower case character"
    (valid? "_AB3CCC") => false)
  
  (fact
    "it rejects passwords that do not contain 
    at least one underscore character"
    (valid? "aAB3CCC") => false)
  
  (fact 
    "it rejects passwords that do not contain 
    at least one numeric character"
    (valid? "_Abcccc") => false))

