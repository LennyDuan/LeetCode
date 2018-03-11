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
    });
  });
});