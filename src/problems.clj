(ns problems)

;; Demonstrate your ability to manipulate Clojure data structures.
;; In each "comment" block, replace "TODO" with Clojure code
;; to complete the required goal.
;;
;; "=>" indicates the result of evaluating the preceding Clojure expression,
;; E.g. (+ 1 1) => 2.
;; Shapes of the results we are looking for are provided.

;; Sample YU-GI-OH cards data:
(def all-cards (read-string (slurp "yugioh-cards.edn")))

(comment
  ;; Example problem with solution

  ;; GOAL: Find each card name and defend value, sorting from
  ;; the most highest defend value one.

  (->> all-cards
       (map (fn [{:keys [name def]}]
              [name def]))
       (sort-by second)
       reverse)
  ;; => [["Super Vehicroid - Mobile Base" 5000]
  ;;     ["Mementoal Tecuhtlica - Combined Creation" 5000]
  ;;     ["Malefic Truth Dragon" 5000]
  ;;     ["Five-Headed Dragon" 5000]
  ;;     ...]
  )

(comment
  ;; (EASY)
  ;; GOAL: Find names of all cards
  ;; Hint: `map` applies a function to each element of a sequence

  ;; TODO
  ;; => ["\"A\" Cell Breeding Device"
  ;;     "\"A\" Cell Incubator"
  ;;     "\"A\" Cell Recombination Device"
  ;;     "\"A\" Cell Scatter Burst"
  ;;     "\"Infernoble Arms - Almace\""
  ;;     ...]
  )

(comment
  ;; GOAL: Find average attack damage for all "Fiend" type monsters.
  ;; Required helper fucnction: `average`
  ;; Hint:
  ;; 1. uses `reduce` to aggregate sequence of values into single value.
  ;; 2. uses `count` to count number of element in a sequence.
  ;; 3. uses `filter` to select only "Fiend" type monster cards.
  ;; 4. uses `apply` to spread function arguments
  ;; E.g. (+ 1 2 3 4) = (apply + [1 2 3 4])

  (defn average
    "Returns the average of the nums."
    [& nums]
    ;; TODO
    )
  ;; (average 1 2 3 4) => 5/2

  (->> all-cards
       ;; TODO
       )
  ;; => 1405.072639225182
  ;; (EXTRA: `double` converts number of rationale type to double type,
  ;; e.g. (double 580295/413) => 1405.072639225182)
  )

(comment
  ;; GOAL: Find each card's name and average price from all markets,
  ;; sorting by most expensive first.
  ;; Hint: uses `read-string` to convert string to number.

  (->> all-cards
       ;; TODO
       )
  ;; => [["Ten Thousand Dragon" 768.6719999999999]
  ;;     ["Blood Mefist" 412.5200000000001]
  ;;     ["Get Your Game On!" 333.452]
  ;;     ...]
  )

(comment
  ;; (DIFFICULT)
  ;; GOAL: Find set name and average price of cards in the set
  ;; (where each card's price is the average price from all markets),
  ;; sorting from highest average card price set.
  ;; Hint:
  ;; 1. Account for the fact that one card may appear in more than one sets.
  ;; 2. `mapcat` helps expand one element into many, e.g.
  ;; (mapcat identity [[1] [1 2]]) => [1 1 2]
  ;; 3. `group-by` groups elements of a sequence into different group.

  (->> all-cards
       ;; TODO
       )
  ;; => [["Yu-Gi-Oh! Championship Series 2011 Prize Card" 412.5200000000001]
  ;;     ["Yu-Gi-Oh! Championship Series 2019 prize card" 312.79200000000003]
  ;;     ["Yu-Gi-Oh! World Championship 2006 prize cards" 250.67800000000003]
  ;;     ["Duelist League Series 10 participation card" 193.274]
  ;;     ...]
  )
