(ns password-validator.core)

(defn- with-more-than-6-chars? [password]
  (> (count password) 6))

(defn- at-least-one-upper-case-char-in [password]
  (not= nil (some #(Character/isUpperCase %) password)))

(defn valid? [password]
  (and (with-more-than-6-chars? password)
       (at-least-one-upper-case-char-in password)))