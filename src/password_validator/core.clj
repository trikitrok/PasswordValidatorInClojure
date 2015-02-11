(ns password-validator.core)

(defn- has-more-than-6-chars? [password]
  (> (count password) 6))

(defn- any? [pred coll]
  (not= nil (some pred coll)))

(def ^:private contains-at-least-one-upper-case-char?
  (partial any? #(Character/isUpperCase %)))

(def ^:private contains-at-least-one-lower-case-char?
  (partial any? #(Character/isLowerCase %)))

(def ^:private contains-at-least-one-underscore-char?
  (partial any? #{\_}))

(def ^:private contains-at-least-one-numeric-char?
  (partial any? #(Character/isDigit %)))

(def ^:private conditions-to-be-valid 
  [has-more-than-6-chars?
   contains-at-least-one-upper-case-char? 
   contains-at-least-one-lower-case-char?
   contains-at-least-one-underscore-char?
   contains-at-least-one-numeric-char?])

(defn valid? [password]
  (every? #(% password) conditions-to-be-valid))