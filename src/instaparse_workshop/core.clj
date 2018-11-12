(ns instaparse-workshop.core
  (:require [instaparse.core :as instaparse]))

;; add your language here
(def parser
  (instaparse/parser  "
    lines = (line <'\\n'>)*
    line = anything
    anything = #'[^\\n]*'
  "))


(defn parse [input]
  (->> (parser input)
       (instaparse/transform {})))
