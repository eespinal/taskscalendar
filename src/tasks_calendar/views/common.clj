(ns tasks_calendar.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page :only [include-css html5]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "tasks_calendar"]
               (include-css "/css/reset.css")]
              [:body
               [:div#wrapper
                content]]))
