(ns testing.core-test
  (:require [expectations.clojure.test :refer [defexpect expecting]]
            [testing.core :refer :all]))

(defexpect a-test
           (expecting "I pass."
                      (expect 1 1)))

(defexpect b-test
           (expecting "FIXME, I fail."
                      (expect 1 0)))
