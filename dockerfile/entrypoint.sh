#!/bin/sh
set -e

nginx -v

exec "$@"
