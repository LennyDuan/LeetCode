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
};

module.exports = {
  addTwoNumbers,
};
