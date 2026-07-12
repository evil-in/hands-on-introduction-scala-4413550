object Etl:
  sealed trait Etl[A, B]:
    def extract (input: String): A
    def transform(data: A): B
    def load(data: B, output: String): Unit

    