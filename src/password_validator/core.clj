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

(def ^:private at-least-one-numeric-char-in?
  (partial any? #(Character/isDigit %)))

(def ^:private conditions-to-be-valid 
  [more-than-6-chars-in?
   at-least-one-upper-case-char-in? 
   at-least-one-lower-case-char-in?
   at-least-one-underscore-char-in?
   at-least-one-numeric-char-in?])

(defn valid? [password]
  (every? #(% password) conditions-to-be-valid))