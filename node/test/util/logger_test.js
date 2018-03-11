import { log, info, debug } from '../../src/util/logger.js'

describe('util', () => {
  describe('logger', () => {
    describe('log', () => {
      it('Should output log log', async () => {
        log('log: output');
      });
    });

    describe('debug', () => {
      it('Should output debug log', async () => {
        debug('debug: output');
      });
    });

    describe('info', () => {
      it('Should output info log', async () => {
        info('log: info');
      });
    });
  });
});
