/**
 * Copyright 2015, Xiaomi.
 * All rights reserved.
 * Author: yongxing@xiaomi.com
 */

package com.xiaomi.infra.galaxy.talos.client;

public class TalosClientConfigKeys {
  // client config

  /**
   * Constants for http/https rpc address
   */
  public static final String GALAXY_TALOS_SERVICE_ENDPOINT =
      "galaxy.talos.service.endpoint";

  /**
   * The http client connection params
   */
  public static final String GALAXY_TALOS_HTTP_MAX_TOTAL_CONNECTION =
      "galaxy.talos.http.max.total.connection";
  public static final int GALAXY_TALOS_HTTP_MAX_TOTAL_CONNECTION_DEFAULT = 160;

  public static final String GALAXY_TALOS_HTTP_MAX_TOTAL_CONNECTION_PER_ROUTE =
      "galaxy.talos.http.max.total.connection.per.route";
  public static final int GALAXY_TALOS_HTTP_MAX_TOTAL_CONNECTION_PER_ROUTE_DEFAULT =
      160;

  /**
   * The client whether to retry
   */
  public static final String GALAXY_TALOS_CLIENT_IS_RETRY =
      "galaxy.talos.client.is.retry";
  public static final boolean GALAXY_TALOS_CLIENT_IS_RETRY_DEFAULT = false;

  /**
   * The client whether auto location the serving restserver
   */
  public static final String GALAXY_TALOS_CLIENT_IS_AUTO_LOCATION =
      "galaxy.talos.client.is.auto.location";
  public static final boolean GALAXY_TALOS_CLIENT_IS_AUTO_LOCATION_DEFAULT = true;

  /**
   * The client get schedule info max retry
   */
  public static final String GALAXY_TALOS_CLIENT_SCHEDULE_INFO_MAX_RETRY =
      "galaxy.talos.client.schedule.info.max.retry";
  public static final int GALAXY_TALOS_CLIENT_SCHEDULE_INFO_MAX_RETRY_DEFAULT = 1;

  /**
   * The client max retry times before throw exception
   */
  public static final String GALAXY_TALOS_CLIENT_MAX_RETRY =
      "galaxy.talos.client.max.retry";
  public static final int GALAXY_TALOS_CLIENT_MAX_RETRY_DEFAULT = 1;

  /**
   * The client timeout milli secs when write/read
   */
  public static final String GALAXY_TALOS_CLIENT_TIMEOUT_MILLI_SECS =
      "galaxy.talos.client.timeout.milli.secs";
  public static final int GALAXY_TALOS_CLIENT_TIMEOUT_MILLI_SECS_DEFAULT = 10000;

  /**
   * The client DDL operation timeout
   */
  public static final String GALAXY_TALOS_CLIENT_ADMIN_TIMEOUT_MILLI_SECS =
      "galaxy.talos.client.admin.timeout.milli.secs";
  public static final int GALAXY_TALOS_CLIENT_ADMIN_TIMEOUT_MILLI_SECS_DEFAULT =
      30000;

  /**
   * The client connection timeout
   */
  public static final String GALAXY_TALOS_CLIENT_CONN_TIMECOUT_MILLI_SECS =
      "galaxy.talos.client.conn.timeout.milli.secs";
  public static final int GALAXY_TALOS_CLIENT_CONN_TIMECOUT_MILLI_SECS_DEFAULT =
      5000;


  // producer config

  /**
   * The producer buffered message number for one partition
   * if the total number exceed it, not allowed to addMessage for user
   */
  public static final String GALAXY_TALOS_PRODUCER_MAX_BUFFERED_MESSAGE_NUMBER =
      "galaxy.talos.producer.max.buffered.message.number";
  public static final int GALAXY_TALOS_PRODUCER_MAX_BUFFERED_MESSAGE_NUMBER_DEFAULT =
      1000000;

  /**
   * The producer buffered message bytes for one partition
   * if the total bytes exceed it, not allowed to addMessage for user
   */
  public static final String GALAXY_TALOS_PRODUCER_MAX_BUFFERED_MESSAGE_BYTES =
      "galaxy.talos.producer.max.buffered.message.bytes";
  public static final int GALAXY_TALOS_PRODUCER_MAX_BUFFERED_MESSAGE_BYTES_DEFAULT =
      500 * 1024 * 1024;

  /**
   * The producer buffered message time for one partition
   * if the oldest buffered message always exceed the time,
   * putMessage will always be called
   */
  public static final String GALAXY_TALOS_PRODUCER_MAX_BUFFERED_MILLI_SECS =
      "galaxy.talos.producer.max.buffered.milli.secs";
  public static final int GALAXY_TALOS_PRODUCER_MAX_BUFFERED_MILLI_SECS_DEFAULT = 200;

  /**
   * The producer max number of message in each putMessage batch
   */
  public static final String GALAXY_TALOS_PRODUCER_MAX_PUT_MESSAGE_NUMBER =
      "galaxy.talos.producer.max.put.message.number";
  public static final int GALAXY_TALOS_PRODUCER_MAX_PUT_MESSAGE_NUMBER_DEFAULT =
      2000;
  public static final int GALAXY_TALOS_PRODUCER_MAX_PUT_MESSAGE_NUMBER_MINIMUM = 1;
  public static final int GALAXY_TALOS_PRODUCER_MAX_PUT_MESSAGE_NUMBER_MAXIMUM =
      5000;

  /**
   * The producer max bytes of message in each putMessage batch
   */
  public static final String GALAXY_TALOS_PRODUCER_MAX_PUT_MESSAGE_BYTES =
      "galaxy.talos.producer.max.put.message.bytes";
  public static final int GALAXY_TALOS_PRODUCER_MAX_PUT_MESSAGE_BYTES_DEFAULT =
      1024 * 1024;
  public static final int GALAXY_TALOS_PRODUCER_MAX_PUT_MESSAGE_BYTES_MINIMUM = 1;
  public static final int GALAXY_TALOS_PRODUCER_MAX_PUT_MESSAGE_BYTES_MAXIMUM =
      10 * 1024 * 1024;

  /**
   * The producer thread pool number
   */
  public static final String GALAXY_TALOS_PRODUCER_THREAD_POOL_SIZE =
      "galaxy.talos.producer.thread.pool.size";
  public static final int GALAXY_TALOS_PRODUCER_THREAD_POOL_SIZE_DEFAULT = 16;

  /**
   * The producer scan/update partition number interval
   */
  public static final String GALAXY_TALOS_PRODUCER_CHECK_PARTITION_INTERVAL =
      "galaxy.talos.producer.check.partition.interval";
  public static final int GALAXY_TALOS_PRODUCER_CHECK_PARTITION_INTERVAL_DEFAULT =
      1000 * 60 * 3;
  public static final int GALAXY_TALOS_PRODUCER_CHECK_PARTITION_INTERVAL_MINIMUM =
      1000 * 60 * 1;
  public static final int GALAXY_TALOS_PRODUCER_CHECK_PARTITION_INTERVAL_MAXIMUM =
      1000 * 60 * 5;

  /**
   * The producer update partitionId time interval when calling addMessage
   * 100 million secs by default
   */
  public static final String GALAXY_TALOS_PRODUCER_UPDATE_PARTITIONID_INTERVAL =
      "galaxy.talos.producer.update.partition.id.interval.milli";
  public static final long GALAXY_TALOS_PRODUCER_UPDATE_PARTITIONID_INTERVAL_DEFAULT =
      100;
  public static final long GALAXY_TALOS_PRODUCER_UPDATE_PARTITIONID_INTERVAL_MINIMUM =
      1;
  public static final long GALAXY_TALOS_PRODUCER_UPDATE_PARTITIONID_INTERVAL_MAXIMUM =
      500;

  /**
   * The producer update partitionId
   * when message number added one partition enough large
   */
  public static final String GALAXY_TALOS_PRODUCER_UPDATE_PARTITION_MSGNUMBER =
      "galaxy.talos.producer.update.partition.msgnumber";
  public static final long GALAXY_TALOS_PRODUCER_UPDATE_PARTITION_MSGNUMBER_DEFAULT =
      1000;

  /**
   * The producer partitionSender sleep/delay time when partitionNotServing
   */
  public static final String GALAXY_TALOS_PRODUCER_WAIT_PARTITION_WORKING_TIME =
      "galaxy.talos.producer.wait.partition.working.time.milli";
  public static final long GALAXY_TALOS_PRODUCER_WAIT_PARTITION_WORKING_TIME_DEFAULT =
      200;

  /**
   * The producer compression type, right now suport "NONE", "SNAPPY" and "GZIP";
   * default is "SNAPPY";
   */
  public static final String GALAXY_TALOS_PRODUCER_COMPRESSION_TYPE =
      "galaxy.talos.producer.compression.type";
  public static final String GALAXY_TALOS_PRODUCER_COMPRESSION_TYPE_DEFAULT = "SNAPPY";

  /**
   * The producer partitionSender sleep/delay time when continuous failure
   */
  public static final String GALAXY_TALOS_PRODUCER_PUT_MESSAGE_BASE_BACKOFF_TIME =
      "galaxy.talos.producer.put.message.base.backoff.time.milli";
  public static final long GALAXY_TALOS_PRODUCER_PUT_MESSAGE_BASE_BACKOFF_TIME_DEFAULT =
      1000 * 10;

  /**
   * The producer partitionSender max sleep/delay time when continuous failure
   */
  public static final String GALAXY_TALOS_PRODUCER_PUT_MESSAGE_MAX_BACKOFF_TIME =
      "galaxy.talos.producer.put.message.max.backoff.time.milli";
  public static final long GALAXY_TALOS_PRODUCER_PUT_MESSAGE_MAX_BACKOFF_TIME_DEFAULT =
      1000 * 300;

  /**
   * The producer partitionSender putMessage failed times if greater than n, sleep a while
   */
  public static final String GALAXY_TALOS_PRODUCER_PUT_MESSAGE_BASE_FAILED_TIMES =
      "galaxy.talos.producer.put.message.base.failed.times";
  public static final int GALAXY_TALOS_PRODUCER_PUT_MESSAGE_BASE_FAILED_TIMES_DEFAULT = 5;

  /**
   * The producer partitionSender putMessage max failed times
   */
  public static final String GALAXY_TALOS_PRODUCER_PUT_MESSAGE_MAX_FAILED_TIMES =
      "galaxy.talos.producer.put.message.max.failed.times";
  public static final int GALAXY_TALOS_PRODUCER_PUT_MESSAGE_MAX_FAILED_TIMES_DEFAULT = 10;

  /**
   * The producer messageQueue will be clear when buffered bytes > 10M
   */
  public static final String GALAXY_TALOS_PRODUCER_CLEAR_MESSAGE_QUEUE_BYTES_THRESHOLD =
      "galaxy.talos.producer.clear.message.queue.bytes.threshold";
  public static final int GALAXY_TALOS_PRODUCER_CLEAR_MESSAGE_QUEUE_BYTES_THRESHOLD_DEFAULT =
      1024 * 1024 * 10;

  // consumer config

  /**
   * The consumer scan/update partition number interval(milli secs)
   */
  public static final String GALAXY_TALOS_CONSUMER_CHECK_PARTITION_INTERVAL =
      "galaxy.talos.consumer.check.partition.interval";
  public static final int GALAXY_TALOS_CONSUMER_CHECK_PARTITION_INTERVAL_DEFAULT =
      60 * 1000;
  public static final int GALAXY_TALOS_CONSUMER_CHECK_PARTITION_INTERVAL_MINIMUM =
      1000 * 60;
  public static final int GALAXY_TALOS_CONSUMER_CHECK_PARTITION_INTERVAL_MAXIMUM =
      1000 * 60 * 3;

  /**
   * The consumer check alive worker info and their serving partitions interval
   */
  public static final String GALAXY_TALOS_CONSUMER_CHECK_WORKER_INFO_INTERVAL =
      "galaxy.talos.consumer.check.worker.info.interval";
  public static final int GALAXY_TALOS_CONSUMER_CHECK_WORKER_INFO_INTERVAL_DEFAULT =
      1000 * 10;
  public static final int GALAXY_TALOS_CONSUMER_CHECK_WORKER_INFO_INTERVAL_MINIMUM =
      1000 * 10;
  public static final int GALAXY_TALOS_CONSUMER_CHECK_WORKER_INFO_INTERVAL_MAXIMUM =
      1000 * 30;

  /**
   * The consumer renew interval for both heartbeat and renew serving partitions
   * the worker column family ttl is 30s by default
   */
  public static final String GALAXY_TALOS_CONSUMER_RENEW_INTERVAL =
      "galaxy.talos.consumer.renew.interval";
  public static final int GALAXY_TALOS_CONSUMER_RENEW_INTERVAL_DEFAULT = 1000 * 7;
  public static final int GALAXY_TALOS_CONSUMER_RENEW_INTERVAL_MINIMUM = 1000 * 7;
  public static final int GALAXY_TALOS_CONSUMER_RENEW_INTERVAL_MAXIMUM = 1000 * 10;

  /**
   * The consumer renew max retry
   */
  public static final String GALAXY_TALOS_CONSUMER_RENEW_MAX_RETRY =
      "galaxy.talos.consumer.renew.max.retry";
  public static final int GALAXY_TALOS_CONSUMER_RENEW_MAX_RETRY_DEFAULT = 1;
  public static final int GALAXY_TALOS_CONSUMER_RENEW_MAX_RETRY_MINIMUM = 1;
  public static final int GALAXY_TALOS_CONSUMER_RENEW_MAX_RETRY_MAXIMUM = 3;

  /**
   * The consumer fetch message operation interval
   * Note server GetRecords qps is [1,5], the minimal interval is 200ms
   */
  public static final String GALAXY_TALOS_CONSUMER_FETCH_INTERVAL =
      "galaxy.talos.consumer.fetch.interval.ms";
  public static final int GALAXY_TALOS_CONSUMER_FETCH_INTERVAL_DEFAULT = 200;
  public static final int GALAXY_TALOS_CONSUMER_FETCH_INTERVAL_MINIMUM = 50;
  public static final int GALAXY_TALOS_CONSUMER_FETCH_INTERVAL_MAXIMUM = 800;

  /**
   * The consumer getRecords max fetch message number
   */
  public static final String GALAXY_TALOS_CONSUMER_MAX_FETCH_RECORDS =
      "galaxy.talos.consumer.max.fetch.records";
  public static final int GALAXY_TALOS_CONSUMER_MAX_FETCH_RECORDS_DEFAULT = 1000;
  public static final int GALAXY_TALOS_CONSUMER_MAX_FETCH_RECORDS_MINIMUM = 1;
  public static final int GALAXY_TALOS_CONSUMER_MAX_FETCH_RECORDS_MAXIMUM = 2000;

  /**
   * The consumer getRecords max fetch message bytes
   */
  public static final String GALAXY_TALOS_CONSUMER_MAX_FETCH_BYTES =
      "galaxy.talos.consumer.max.fetch.bytes";
  public static final int GALAXY_TALOS_CONSUMER_MAX_FETCH_BYTES_DEFAULT = 2 * 1024 * 1024;
  public static final int GALAXY_TALOS_CONSUMER_MAX_FETCH_BYTES_MINIMUM = 1;
  public static final int GALAXY_TALOS_CONSUMER_MAX_FETCH_BYTES_MAXIMUM = 10 * 1024 * 1024;

  /**
   * The consumer worker register self max retry times
   */
  public static final String GALAXY_TALOS_CONSUMER_REGISTER_MAX_RETRY =
      "galaxy.talos.consumer.register.max.retry";
  public static final int GALAXY_TALOS_CONSUMER_REGISTER_MAX_RETRY_DEFAULT = 1;

  /**
   * The consumer commit offset fetched records number threshold
   */
  public static final String GALAXY_TALOS_CONSUMER_COMMIT_OFFSET_THRESHOLD =
      "galaxy.talos.consumer.commit.offset.record.fetched.num";
  public static final int GALAXY_TALOS_CONSUMER_COMMIT_OFFSET_THRESHOLD_DEFAULT = 10000;
  public static final int GALAXY_TALOS_CONSUMER_COMMIT_OFFSET_THRESHOLD_MINIMUM = 5000;
  public static final int GALAXY_TALOS_CONSUMER_COMMIT_OFFSET_THRESHOLD_MAXIMUM = 20000;

  /**
   * The consumer commit offset time interval threshold, milli secs
   */
  public static final String GALAXY_TALOS_CONSUMER_COMMIT_OFFSET_INTERVAL =
      "galaxy.talos.consumer.commit.offset.interval.milli";
  public static final int GALAXY_TALOS_CONSUMER_COMMIT_OFFSET_INTERVAL_DEFAULT = 5000;
  public static final int GALAXY_TALOS_CONSUMER_COMMIT_OFFSET_INTERVAL_MINIMUM = 3000;
  public static final int GALAXY_TALOS_CONSUMER_COMMIT_OFFSET_INTERVAL_MAXIMUM = 8000;

  /**
   * The consumer switch for whether checking lastCommitOffset or not
   * when commit offset
   */
  public static final String GALAXY_TALOS_CONSUMER_CHECK_LAST_COMMIT_OFFSET_SWITCH =
      "galaxy.talos.consumer.check.last.commit.offset.switch";
  public static final boolean GALAXY_TALOS_CONSUMER_CHECK_LAST_COMMIT_OFFSET_SWITCH_DEFAULT =
      false;

  /**
   * The consumer partitionFetcher sleep/delay time when partitionNotServing
   */
  public static final String GALAXY_TALOS_CONSUMER_WAIT_PARTITION_WORKING_TIME =
      "galaxy.talos.consumer.wait.partition.working.time.milli";
  public static final long GALAXY_TALOS_CONSUMER_WAIT_PARTITION_WORKING_TIME_DEFAULT =
      200;

  /**
   * The consumer reset offset by the latest offset when out of range
   */
  public static final String GALAXY_TALOS_CONSUMER_OUT_OF_RANGE_RESET_LATEST_OFFSET =
      "galaxy.talos.consumer.out.of.range.reset.latest.offset";
  public static final boolean GALAXY_TALOS_CONSUMER_OUT_OF_RANGE_RESET_LATEST_OFFSET_DEFAULT =
      false;

  /**
   * When the consumer starts up (including first start and restart),
   * this configuration indicates whether reset the offset which from reading.
   * The default value is false which means reading messages from the
   * 'last commit offset'(restart) or 'MessageOffset.START_OFFSET'(firstly start).
   */
  public static final String GALAXY_TALOS_CONSUMER_START_WHETHER_RESET_OFFSET =
      "galaxy.talos.consumer.start.whether.reset.offset";
  public static final boolean GALAXY_TALOS_CONSUMER_START_WHETHER_RESET_OFFSET_DEFAULT = false;

  /**
   * In the following conditions, this configuration will be effective:
   * 1) 'galaxy.talos.consumer.restart.whether.reset.offset' is 'true';
   * 2) the consumer is firstly starting which means there is not historical committed offset
   * Either condition above will lead to the consumer reading messages from the 'reset offset'.
   *
   * The value of 'reset offset' has two kinds: -1, -2.
   * '-1' represents reading message from 'MessageOffset.START_OFFSET'
   * '-2' represents reading message from 'MessageOffset.LATEST_OFFSET'
   */
  public static final String GALAXY_TALOS_CONSUMER_START_RESET_OFFSET_VALUE =
      "galaxy.talos.consumer.start.reset.offset.value";
  public static final long GALAXY_TALOS_CONSUMER_START_RESET_OFFSET_AS_START = -1;
  public static final long GALAXY_TALOS_CONSUMER_START_RESET_OFFSET_AS_END = -2;

  /**
   * The consumer checkpoint auto commit;
   */
  public static final String GALAXY_TALOS_CONSUMER_CHECKPOINT_AUTO_COMMIT =
      "galaxy.talos.consumer.checkpoint.auto.commit";
  public static final boolean GALAXY_TALOS_CONSUMER_CHECKPOINT_AUTO_COMMIT_DEFAULT = true;

  /**
   * The greedy consumer local offset stored path;
   */
  public static final String GALAXY_TALOS_GREEDYCONSUMER_LOCAL_OFFSET_PATH =
      "galaxy.talos.greedyconsumer.local.offset.path";
  public static final String GALAXY_TALOS_GREEDYCONSUMER_LOCAL_OFFSET_PATH_DEFUALT =
      "/.talos/offset/";

  /**
   * The greedy consumer checkpoint interval(milli secs), default 10 seconds;
   */
  public static final String GALAXY_TALOS_GREEDYCONSUMER_CHECKPOINT_INTERVAL =
      "galaxy.talos.greedyconsumer.checkpoint.interval";
  public static final long GALAXY_TALOS_GREEDYCONSUMER_CHECKPOINT_INTERVAL_DEFAULT =
      1000 * 10;
  public static final long GALAXY_TALOS_GREEDYCONSUMER_CHECKPOINT_INTERVAL_MINIMUM =
      1000 * 5;
  public static final long GALAXY_TALOS_GREEDYCONSUMER_CHECKPOINT_INTERVAL_MAXIMUM =
      1000 * 60 * 3;

  /**
   * The greedy consumer checkpoint mode,the default mode is asynchronous;
   */
  public static final String GALAXY_TALOS_GREEDYCONSUMER_SYNCHRONOUS_CHECKPOINT =
      "galaxy.talos.greedyconsumer.synchronous.checkpoint";
  public static final boolean GALAXY_TALOS_GREEDYCONSUMER_SYNCHRONOUS_CHECKPOINT_DEFAULT =
      false;

  /**
   * Stress tests params
   */
  public static final String GALAXY_TALOS_ACCESSKEY =
      "galaxy.talos.accessKey";

  public static final String GALAXY_TALOS_ACCESSSECRET =
      "galaxy.talos.accessSecret";

  public static final String GALAXY_TALOS_TOPICNAME =
      "galaxy.talos.topicName";

  public static final String GALAXY_TALOS_PARTITIONID =
      "galaxy.talos.partitionid";

  public static final String GALAXY_TALOS_PUTINTERVAL =
      "galaxy.talos.putInterval";

  public static final String THREAD_NUM_PERPARTITION =
      "thread.num.perpartition";

  public static final String QPS_PERTHREAD = "qps.perthread";

  public static final String MESSAGE_STR = "message.str";
  public static final String MESSAGE_STR_DEFAULT = "this message is 1K. this message is 1K. this message is 1K. "
      + "this message is 1K. this message is 1K. this message is 1K. this message is 1K. this message is 1K. "
      + "this message is 1K. this message is 1K. this message is 1K. this message is 1K. this message is 1K. "
      + "this message is 1K. this message is 1K. this message is 1K. this message is 1K. this message is 1K. "
      + "this message is 1K. this message is 1K. this message is 1K. this message is 1K. this message is 1K. "
      + "this message is 1K. this message is 1K. this message";

  /**
   * The TALOS client falcon monitor related;
   */
  public static String GALAXY_TALOS_METRIC_FALCON_URL = "galaxy.talos.metric.falcon.url";
  public static String GALAXY_TALOS_METRIC_FALCON_URL_DEFAULT = "http://127.0.0.1:1988/v1/push";

  public static final String GALAXY_TALOS_REPORT_METRIC_INTERVAL_MILLIS =
      "galaxy.talos.client.report.metric.interval.millis";
  public static final int GALAXY_TALOS_REPORT_METRIC_INTERVAL_MILLIS_DEFAULT = 60000;

  public static final String GALAXY_TALOS_CLIENT_FALCON_STEP =
      "galaxy.talos.sdk.falcon.step";
  public static final long GALAXY_TALOS_CLIENT_FALCON_STEP_DEFAULT =
      1000 * 60;

  public static final String GALAXY_TALOS_CLIENT_ALERT_TYPE = "galaxy.talos.client.alert.type";
  public static final String GALAXY_TALOS_CLIENT_ALERT_TYPE_DEFAULT = "srv";

  public static final String GALAXY_TALOS_CONSUMER_METRIC_FALCON_ENDPOINT =
      "galaxy.talos.consumer.metric.falcon.endpoint";
  public static final String GALAXY_TALOS_CONSUMER_METRIC_FALCON_ENDPOINT_DEFAULT =
      "talos.consumer.";
  public static final String GALAXY_TALOS_PRODUCER_METRIC_FALCON_ENDPOINT =
      "galaxy.talos.producer.metric.falcon.endpoint";
  public static final String GALAXY_TALOS_PRODUCER_METRIC_FALCON_ENDPOINT_DEFAULT =
      "talos.producer.";
  public static final String GALAXY_TALOS_GREEDY_METRIC_FALCON_ENDPOINT =
      "galaxy.talos.greedy.metric.falcon.endpoint";
  public static final String GALAXY_TALOS_GREEDY_METRIC_FALCON_ENDPOINT_DEFAULT =
      "talos.consumer.greedy.";

  public static final String GALAXY_TALOS_CLIENT_FALCON_MONITOR_SWITCH =
      "galaxy.talos.client.falcon.monitor.switch";
  public static final boolean GALAXY_TALOS_CLIENT_FALCON_MONITOR_SWITCH_DEFAULT = true;
}