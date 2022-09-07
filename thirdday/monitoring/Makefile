all: start

start:
	docker-compose -f docker-compose.yml up -d

deploy: init prepare-and-deploy

init:
	dir=$(pwd)
	cd infrastructure/terraform 
	terraform init
	terraform apply
	cd $dir

prepare-and-deploy:
	dir=$(pwd)
	cd infrastructure/ansible 
	ansible-playbook -i inventory.yaml playbook.yaml
	cd $dir
