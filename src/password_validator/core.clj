(ns password-validator.core)

(defn- with-more-than-6-chars? [password]
  (> (count password) 6))

(defn valid? [password]
  (with-more-than-6-chars? password))