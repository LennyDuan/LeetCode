import { info, debug } from '../../src/util/logger';
import { ListNode } from '../../src/util/class/linkedlist';


// EASY - Brute Force:  is fucking stupid.
// Time(O) -> O(NlogN); Space(O) -> O(N)

// Medium - Merge 2 pair:  is not difficult.
// Time(O) -> O(Nlogk); Space(O) -> O(1)

// A bit Harder - Merge Compare one by one: I used here
// Time(O) -> O(kN); Space(O) -> O(N)

/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode[]} lists
 * @return {ListNode}
 */
const mergeKLists = function (lists) {
  info(`${lists.length} ListNodes in this list`);
  lists.forEach((ele, index) =>
    debug(`List [${index}]: ${ele.toString()}`));
  return 0;

};


module.exports = {
  mergeKLists,
};
