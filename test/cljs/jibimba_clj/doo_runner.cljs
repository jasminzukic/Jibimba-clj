(ns jibimba-clj.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [jibimba-clj.core-test]))

(doo-tests 'jibimba-clj.core-test)

