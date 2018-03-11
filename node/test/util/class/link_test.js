import { ListNode } from '../../../src/util/class/link.js';
import { assert } from 'chai';
import { log, info, debug } from '../../../src/util/logger.js'

info(ListNode);
describe('util', () => {
  describe('class', () => {
    describe('link', () => {

      it('Should create a ListNode object', () => {
          const node = new ListNode(1);
          assert.deepEqual(1, node.value);
          node.value = 2;
          assert.deepEqual(2, node.value);
      });

      it('Should be able to assgin a node to next', () => {
          const node = new ListNode(1);
          assert.deepEqual(1, node.value);
          const nodeNext = new ListNode(2)
          assert.deepEqual(2, nodeNext.value);
          node.next = nodeNext;
          assert.deepEqual(2, node.next.value);
      });

      it('Should return expected toString', () => {
          const node = new ListNode(1);
          assert.deepEqual(1, node.toString());
      });

      it('Should return expected list toString', () => {
        const nodeOne2 = new ListNode(2);
        const nodeOne4 = new ListNode(4);
        const nodeOne3 = new ListNode(3);
        const nodeOne5 = new ListNode(5);

        nodeOne2.next = nodeOne4;
        nodeOne4.next = nodeOne3;
        nodeOne3.next = nodeOne5;
        debug(nodeOne2.toString());
        debug(nodeOne3.toString());
        assert.deepEqual('2 -> 4 -> 3 -> 5', nodeOne2.toString());
      });

    });
  });
});
