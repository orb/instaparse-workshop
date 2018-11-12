(ns instaparse-workshop.roll)

;; a parser for the dice roll language from Alex's sept talk
;; https://www.meetup.com/Austin-Clojure-Meetup/events/dhtzlfyxmbnb/
;;
;; my original version:
;; https://gist.github.com/orb/3e1d869d4140074c01ad65954c60d7ec

(defn parse-number [str]
  (Integer/parseInt str))

(defn parse-roll [input]
  (let [grammar (slurp (clojure.java.io/resource "roll.ebnf"))
        parser (instaparse/parser grammar)]
    (instaparse/parse parser input)))

(defn transform-roll [roll-parse-tree]
  (let [roll-transform {
                        ;; transform options go here
                        }]
    (instaparse/transform roll-transform roll-parse-tree)))


