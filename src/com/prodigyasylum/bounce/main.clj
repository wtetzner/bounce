(ns com.prodigyasylum.bounce.main
  (:gen-class))

(defn -main
  "Main method"
  [& args]
  (println (apply str (interpose ", " args))))
