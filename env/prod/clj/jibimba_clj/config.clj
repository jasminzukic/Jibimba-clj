(ns jibimba-clj.config
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[jibimba-clj started successfully]=-"))
   :middleware identity})
