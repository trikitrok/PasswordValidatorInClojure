(ns password-validator.core)

(defn- more-than-6-chars-in? [password]
  (> (count password) 6))

(defn- at-least-one-upper-case-char-in [password]
  (not= nil (some #(Character/isUpperCase %) password)))

(defn- at-least-one-lower-case-char-in [password]
  (not= nil (some #(Character/isLowerCase %) password)))

(defn valid? [password]
  (and (more-than-6-chars-in? password)
       (at-least-one-upper-case-char-in password)
       (at-least-one-lower-case-char-in password)))