all: start

start:
	docker-compose -f docker-compose.yml up -d

infra-apply:
	cd infrastructure/terraform && terraform init
	cd infrastructure/terraform && terraform apply

infra-destroy:
	cd infrastructure/terraform && terraform destroy

infra-install:
	cd infrastructure/ansible && ansible-playbook -i inventory.yaml playbook.yaml
