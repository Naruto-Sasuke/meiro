(ns meiro.binary-tree-test
	(:require [clojure.test :refer :all]
						[meiro.core :refer :all]
						[meiro.binary-tree :refer :all]))

(deftest create-test
	(testing "Ensure all cells are linked."
		(is (every? #(not-any? empty? %) (create (init 10 12))))))
