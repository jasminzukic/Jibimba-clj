(ns jibimba-clj.app
  (:require [jibimba-clj.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
