(ns aoc2019.day1)

(defn fuel_cost [mass]
(- (java.lang.Math/floor (/ mass 3)) 2))

(defn solve [input]
  (reduce + (map fuel_cost input)))

(def input
  (map #( java.lang.Integer/parseInt % ) (clojure.string/split-lines (slurp "input"))))
