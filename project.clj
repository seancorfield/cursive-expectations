(defproject testing "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-beta3"]
                 [expectations "2.2.0-rc3"]]
  :main ^:skip-aot testing.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
