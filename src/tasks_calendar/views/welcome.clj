(ns tasks_calendar.views.welcome
  (:require [tasks_calendar.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to tasks_calendar"]))
