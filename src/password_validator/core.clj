(ns password-validator.core)

(defn- more-than-6-chars-in? [password]
  (> (count password) 6))

(defn- any? [pred coll]
  (not= nil (some pred coll)))

(def ^:private at-least-one-upper-case-char-in?
  (partial any? #(Character/isUpperCase %)))

(def ^:private at-least-one-lower-case-char-in?
  (partial any? #(Character/isLowerCase %)))

(def ^:private at-least-one-underscore-char-in?
  (partial any? #{\_}))

(defn valid? [password]
  (and (more-than-6-chars-in? password)
       (at-least-one-upper-case-char-in? password)
       (at-least-one-lower-case-char-in? password)
       (at-least-one-underscore-char-in? password)))