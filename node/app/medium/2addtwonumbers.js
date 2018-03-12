import { ListNode } from '../../src/util/class/linkedlist';
import { info } from '../../src/util/logger';
/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
const addTwoNumbers = function (l1, l2) {
  info(`L1: ${l1.value}`);
  info(`L2: ${l2.value}`);
  let firstValue = l1.value + l2.value;
  if (firstValue > 10) {
    firstValue -= 10;
  }
  const list = new ListNode(firstValue);
  let biggerZero = firstValue > 10 ? 1 : 0;

  let l1current = l1.next;
  let l2current = l1.next;
  let current = list;

 // 3 ListNode requir 3 header
  while (l1current) {
    let val = l1current.value + l2current.value + biggerZero;

    if (val > 10) {
      biggerZero = 1;
      val -= 10;
    } else {
      biggerZero = 0;
    }

    l1current = l1current.next;
    l2current = l2current.next;
    current.next = new ListNode(val);
    current = current.next;
  }
  current.next = biggerZero ? new ListNode(1) : null;
  return list;
};

module.exports = {
  addTwoNumbers,
};
