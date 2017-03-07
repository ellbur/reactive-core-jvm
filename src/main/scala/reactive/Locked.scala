
package reactive

class Locked[A](init: A) {
  private[this] var current: A = init
  def set(next: A) { synchronized { current = next } }
  def get: A = synchronized { current }
  def transform(f: A => A): A = synchronized { current = f(current) ; current }
}
