(ns tasks_calendar.views.routes
  (:require [tasks_calendar.views.common :as common]
  			[noir.response :as response])
  (:use [noir.core :only [defpage]]))

(defpage "/api/tasks" []
		 (common/layout
		 	[:p "This is an API response2"]))

(defpage "/api/tasks/json" []
		 (response/json "This is an API response2"))