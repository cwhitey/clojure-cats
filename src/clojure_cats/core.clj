(ns clojure-cats.core
  (:require [cats.core :as m]
            [cats.builtin :refer :all]
            [cats.monad.maybe :as maybe]
            [cats.monad.either :as either]
            [cats.protocols :as p])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (let [one (m/mappend (maybe/just [1 2 3])
                       (maybe/nothing)
                       (maybe/just [4 5 6])
                       (maybe/nothing))]
    (println one)))

(p/-get-context (maybe/just 1))
(m/pure either/context 1)
