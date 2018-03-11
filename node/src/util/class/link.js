class ListNode {
  
  constructor(value) {
    this.value = value;
    this.node = null;
  }

  set value(value) {
    this.value = value;
  }

  set next(node) {
    this.node = node;
  }

  get value() {
    return this.value;
  }

  get next() {
    return this.node;
  }
}
