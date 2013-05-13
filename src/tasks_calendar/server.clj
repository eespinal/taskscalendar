(ns tasks_calendar.server
  (:require [noir.server :as server]))

(server/load-views-ns 'tasks_calendar.views)

(defn -main [& m]
  (let [mode (keyword (or (first m) :dev))
        port (Integer. (get (System/getenv) "PORT" "8081"))]
    (server/start port {:mode mode
                        :ns 'tasks_calendar})))

