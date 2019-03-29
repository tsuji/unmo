(defproject unmo "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [bigml/sampling "3.2"]
                 [fipp "0.6.17"]
                 [com.worksap.nlp/sudachi "0.1.2-SNAPSHOT"]]
  :main ^:skip-aot unmo.core
  :target-path "target/%s"
  :repositories {"sonartype snapshots" "https://oss.sonatype.org/content/repositories/snapshots"}
  :profiles {:uberjar {:aot :all}})
