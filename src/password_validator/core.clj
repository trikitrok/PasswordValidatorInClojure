(ns password-validator.core)

(defn valid? [password]
  (> (count password) 6))