(defproject org.clojars.jcrossley3/korma "1.0.0-SNAPSHOT"
  :description "Tasty SQL for Clojure, with a more liberal connection spec policy"
  :url "http://github.com/ibdknox/korma"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [c3p0/c3p0 "0.9.1.2"]
                 [org.clojure/java.jdbc "0.2.2"]]
  :codox {:exclude [korma.sql.engine korma.sql.fns korma.sql.utils]}
  :dev-dependencies [[postgresql "9.0-801.jdbc4"]
                     [lein-clojars "0.7.0"]])
