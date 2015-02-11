(ns password-validator.core)

(defn- more-than-6-chars-in? [password]
  (> (count password) 6))

(defn- any? [pred coll]
  (not= nil (some pred coll)))

(defn- at-least-one-upper-case-char-in? [password]
  (any? #(Character/isUpperCase %) password))

(defn- at-least-one-lower-case-char-in? [password]
  (any? #(Character/isLowerCase %) password))

(defn- at-least-one-underscore-char-in? [password]
  (any? #{\_} password))

(defn valid? [password]
  (and (more-than-6-chars-in? password)
       (at-least-one-upper-case-char-in? password)
       (at-least-one-lower-case-char-in? password)
       (at-least-one-underscore-char-in? password)))