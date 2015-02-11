(ns password-validator.core)

(defn- with-more-than-6-chars? [password]
  (> (count password) 6))

(defn valid? [password]
  (and (with-more-than-6-chars? password)
       (not= nil (some #(Character/isUpperCase %) password))))