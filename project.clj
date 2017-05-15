(defproject chbrown/data.json "0.2.7-SNAPSHOT"
  :description "JSON parser/generator to/from Clojure data structures"
  :url "https://github.com/chbrown/data.json"
  :license {:name "Eclipse Public License"
            :url "http://opensource.org/licenses/eclipse-1.0.php"}
  :source-paths ["src/main/clojure"]
  :profiles {:test {:source-paths ["src/main/clojure" "src/test/clojure"]
                    :dependencies [[org.clojure/clojure "1.3.0"]]}})
