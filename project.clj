(defproject cc.qbits/ajdisk-web "0.1.0-SNAPSHOT"
  :description ""
  :url "https://github.com/mpenet/ajdisk-web"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/tools.logging "0.2.6"]
                 [com.gfredericks/catch-data "0.1.0"]]
  :profiles {:1.4  {:dependencies [[org.clojure/clojure "1.4.0"]]}
             :1.5  {:dependencies [[org.clojure/clojure "1.5.0"]]}
             :1.6  {:dependencies [[org.clojure/clojure "1.6.0-master-SNAPSHOT"]]}
             :dev  {:dependencies []}
             :test  {:dependencies []}}
  :codox {:src-dir-uri "https://github.com/mpenet/ajdisk-web/blob/master"
          :src-linenum-anchor-prefix "L"
          :output-dir "doc/codox"}
  :warn-on-reflection true)
