class ListNode {
  constructor(value, next) {
    this.value = value;
    if (next) this.next = next;
    else this.next = null;
  }
}

ListNode.prototype.toString = function () {
  let str = this.value;
  let nextNode = this.next;
  while (nextNode) {
    str += ` -> ${nextNode.value}`;
    nextNode = nextNode.next;
  }
  return str;
};

module.exports = {
  ListNode,
};
