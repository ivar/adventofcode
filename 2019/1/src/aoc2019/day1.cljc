(ns aoc2019.day1)

(defn fuel_cost [mass]
(- (java.lang.Math/floor (/ mass 3)) 2))

(defn aggregate_fuel_cost [mass]

  (loop [current mass
         sum 0]

    (let [new_fuel_cost (fuel_cost current)
          new_sum (+ new_fuel_cost sum)]
      (if (< new_fuel_cost 1)
        sum
        (recur new_fuel_cost, new_sum)
        ))))

(defn solve [input]
  (reduce + (map aggregate_fuel_cost input)))

(def input
  (map #( java.lang.Integer/parseInt % ) (clojure.string/split-lines (slurp "input"))))
