def call(Closure body){
  node {
    def code = { 123 }
    println "Hello World!!"
    assert code() == 123
  }
}
