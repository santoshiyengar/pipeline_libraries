def call(Closure body){
  node {
      def code = {123}
      println "Hello World!!"
      println(code())
  }
}
